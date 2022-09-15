using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.Error
{
    public class PGESecurityTokenCannotBeAdded : PGEException
    {
        private const string DEFAULT_MESSAGE = "El token de seguridad no pudo ser agregado.";

        public PGESecurityTokenCannotBeAdded()
            : base(DEFAULT_MESSAGE)
        {
        }

        public PGESecurityTokenCannotBeAdded(Exception innerException)
            : base(DEFAULT_MESSAGE, innerException)
        {
        }
    }
}
