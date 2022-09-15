using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.Error
{
    public class PGEClientCertificateException: PGEException
    {
        public PGEClientCertificateException(string message)
            : base(message)
        {
        }

        public PGEClientCertificateException(string message, Exception innerException)
            : base(message, innerException)
        {
        }
    }
}
