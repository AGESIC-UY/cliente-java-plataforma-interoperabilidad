using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.Error
{
    public class PGECertificateNotFoundException: PGEException
    {
        private const string MESSAGE_FORMAT = "El certificado {0} no se encuentra instalado en el almacén de certificados.";
        string CertificateDistinguishedName {get; set;}

        public PGECertificateNotFoundException(string certificateDistinguishedName)
            : base(String.Format(MESSAGE_FORMAT, certificateDistinguishedName))
        {
            this.CertificateDistinguishedName = certificateDistinguishedName;
        }

        public PGECertificateNotFoundException(string certificateDistinguishedName, Exception innerException)
            : base(String.Format(MESSAGE_FORMAT, certificateDistinguishedName), innerException)
        {
            this.CertificateDistinguishedName = certificateDistinguishedName;
        }
    }
}
