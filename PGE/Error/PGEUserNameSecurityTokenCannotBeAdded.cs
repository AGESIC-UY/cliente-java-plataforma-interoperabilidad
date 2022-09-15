using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.Error
{
    public class PGEUserNameSecurityTokenCannotBeAdded : PGEException
    {
        private const string DEFAULT_MESSAGE = "El UserNameSecurityToken de seguridad no pudo ser agregado.";

        public PGEUserNameSecurityTokenCannotBeAdded()
            : base(DEFAULT_MESSAGE)
        {
        }

        public PGEUserNameSecurityTokenCannotBeAdded(Exception innerException)
            : base(DEFAULT_MESSAGE, innerException)
        {
        }
    }
}
