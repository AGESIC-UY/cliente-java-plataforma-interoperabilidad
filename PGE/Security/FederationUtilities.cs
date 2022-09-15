using System;
using System.IdentityModel.Tokens;
using System.Security.Cryptography.X509Certificates;
using AGESIC.PGE.Error;

namespace AGESIC.PGE.Security
{
	public sealed class FederationUtilities
	{
        public static X509Certificate2 LookupCertificate(StoreName storeName, StoreLocation storeLocation, string subjectDistinguishedName)
        {
            X509Store store = null;
            try
            {
                store = new X509Store(storeName, storeLocation);
                store.Open(OpenFlags.ReadOnly);
                X509Certificate2Enumerator enumerator = store.Certificates.GetEnumerator();
                X509Certificate2 cert;

                while (enumerator.MoveNext())
                {
                    cert = enumerator.Current;
                }

                X509Certificate2Collection col = store.Certificates;
                X509Certificate2Collection certs = col.Find(X509FindType.FindBySubjectName, subjectDistinguishedName, true);

                /*X509Certificate2Collection certs = col.Find(X509FindType.FindBySerialNumber,
                                                            "16 65 09 fe 00 00 00 00 00 06", false);*/
                if (certs.Count != 1)
                {
                    throw new PGECertificateNotFoundException(subjectDistinguishedName);
                }
                return (X509Certificate2)certs[0];
            }
            catch (Exception ex)
            {
                throw new PGECertificateNotFoundException(subjectDistinguishedName, ex);
            }
            finally
            {
                if (store != null) store.Close();
            }
        }

        internal static X509SecurityToken GetX509TokenFromCert(StoreName storeName,
                                                             StoreLocation storeLocation,
                                                             string subjectDistinguishedName)
        {
            X509Certificate2 certificate = LookupCertificate(storeName, storeLocation, subjectDistinguishedName);
            X509SecurityToken t = new X509SecurityToken(certificate);
            return t;
        }

        internal static byte[] GetCertificateThumbprint(StoreName storeName, StoreLocation storeLocation, string subjectDistinguishedName)
        {
            X509Certificate2 certificate = LookupCertificate(storeName, storeLocation, subjectDistinguishedName);
            return certificate.GetCertHash();
        }

        private FederationUtilities() { }
	}
}
