using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.Error
{
    public class PGEScopeCannotBeCreated : PGEException
    {
        private const string MESSAGE = "No se ha podido crear el scope de la operación.";

        public PGEScopeCannotBeCreated()
            : base(MESSAGE)
        {
        }

        public PGEScopeCannotBeCreated(Exception innerException)
            : base(MESSAGE, innerException)
        {
        }
    }
}
