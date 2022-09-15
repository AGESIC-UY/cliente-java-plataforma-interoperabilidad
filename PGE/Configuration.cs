using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel.Channels;
using System.Security.Cryptography.X509Certificates;
using System.Configuration;

namespace AGESIC.PGE
{
    /// <summary>
    /// Clase que contiene configuraciones referentes al RST.
    /// </summary>
    internal class Configuration
    {
        /// <summary>
        /// Clase con las configuraciones sobre el Certificado a utilizar en el RST
        /// </summary>
        internal class RSTCertificate
        {
            /// <summary>
            /// DistinguishedName del certficado que se utilizará. 
            /// Toma del archivo de configuración la clave "RSTCertificateDN".
            /// Por defecto, toma el valor "test_agesic".
            /// </summary>


            internal static readonly string DistinguishedName = PGEConfigManager.GetInstance().getPGEConfig().RSTCertificateDN;

            /// <summary>
            /// Almacén donde se encuentra el certificado. Toma el valor "StoreName.My".
            /// </summary>
            internal static readonly StoreName Store = (StoreName)Enum.Parse(typeof(StoreName), PGEConfigManager.GetInstance().getPGEConfig().RSTCertificateStoreName); //  StoreName.My;

            /// <summary>
            /// Lugar donde se encuentra el almacén del certificado. Por defecto, StoreLocation.CurrentUser.
            /// </summary>
            internal static readonly StoreLocation Location = (StoreLocation)Enum.Parse(typeof(StoreLocation), PGEConfigManager.GetInstance().getPGEConfig().RSTCertificateStoreLocation); //Settings.Default.RSTCertificateStoreLocation; //StoreLocation.CurrentUser;
        }

        /// <summary>
        /// Clase que configura parámetros utilizados para obtener el Security Token.
        /// </summary>
        internal class SecurityToken
        {
            /// <summary>
            /// SAML Issuer del Token.
            /// Toma del archivo de configuración la clave "SAMLIssuer".
            /// Por defecto, toma el valor "Agesic".
            /// </summary>
            internal static readonly string Issuer = PGEConfigManager.GetInstance().getPGEConfig().SAMLIssuer;

            internal class URL
            {
                /// <summary>
                /// URL del Servicio que expide los Tokens.
                /// Toma del archivo de configuración la clave "STSUrl".
                /// Por defecto, toma el valor "http://pge.red.uy:6001/TrustServer/SecurityTokenService".
                /// </summary>
                private static readonly string STSUrl = PGEConfigManager.GetInstance().getPGEConfig().STSUrl;

                /// <summary>
                /// URL del Servicio que expide los Tokens.
                /// Toma del archivo de configuración la clave "STSUrlSSL".
                /// Por defecto, toma el valor "http://pge.red.uy:6001/TrustServer/SecurityTokenService".
                /// </summary>
                private static readonly string STSUrlSSL = PGEConfigManager.GetInstance().getPGEConfig().STSUrlSSL;

                /// <summary>
                /// Retorna la URL del STS, discriminando el caso en el que se use SSL o no.
                /// </summary>
                /// <param name="useSSL">Indica si se utilizara SSL para consumir el STS o no.</param>
                /// <returns>La url del STS.</returns>
                internal static string SecurityTokenServiceUrl(bool useSSL)
                {
                    return (useSSL) ? (STSUrlSSL) : (STSUrl);
                }
            }
           
            /// <summary>
            /// Cantidad de minutos maximo de tolerencia a partir del IssueInstant del token
            /// </summary>
            internal static readonly int SAMLMaxFrame = PGEConfigManager.GetInstance().getPGEConfig().SAMLMaxFrame;

            /// <summary>
            /// Cantidad de minutos minimo de tolerencia a partir del IssueInstant del token
            /// </summary>
            internal static readonly int SAMLMinFrame = PGEConfigManager.GetInstance().getPGEConfig().SAMLMinFrame;

            /// <summary>
            /// Setea el Actor para el Header SAML y poder ser procesado por el DataPower cuando sea necesario.
            /// Toma del archivo de configuración la clave "SAMLActor".
            /// Por defecto, toma el valor "".
            /// </summary>
            internal static readonly string SAMLActor = PGEConfigManager.GetInstance().getPGEConfig().SAMLActor;
        }

        /// <summary>
        /// Clase que configura el tipo de addressing que se utilizará y las versiones de los mensajes.
        /// </summary>
        internal class Messaging
        {
            /// <summary>
            /// Versión del mensaje final al servicio que se quiere consumir.
            /// </summary>
            internal static readonly MessageVersion Version = MessageVersion.Soap11WSAddressing10;

            /// <summary>
            /// Booleano que configura el AutoAddressing.
            /// </summary>
            internal static bool AutoAddressing = true;

            /// <summary>
            /// Versión que se utiliza en el RST, sin AutoAddressing.
            /// </summary>
            internal static readonly MessageVersion VersionForSTSwAddressing = MessageVersion.Soap11WSAddressing10;

            /// <summary>
            /// Versión que se utiliza en el RST, con AutoAddressing.
            /// </summary>
            internal static readonly MessageVersion VersionForSTSwoAddressing = MessageVersion.Soap11;

            /// <summary>
            /// Versión que se utiliza en el RST, combinando los valores de AutoAddressing, VersionForSTSwAddressing y VersionForSTSwoAddressing.
            /// </summary>
            internal static readonly MessageVersion VersionForSTS = (AutoAddressing) ? (VersionForSTSwAddressing) : (VersionForSTSwoAddressing);
        }
    }
}
