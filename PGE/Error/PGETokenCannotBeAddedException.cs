using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.Error
{
    public class PGETokenCannotBeAddedException : PGEException
    {
        private const string MESSAGE = "No se puede incluir el token SAML.";

        public PGETokenCannotBeAddedException()
            : base(MESSAGE)
        {
        }

        public PGETokenCannotBeAddedException(Exception innerException)
            : base(MESSAGE, innerException)
        {
        }
    }
}
