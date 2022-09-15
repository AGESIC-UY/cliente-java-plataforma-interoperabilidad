using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.Error
{
    public class PGEEndPointCannotBeCreatedException : PGEException
    {
        private const string MESSAGE = "El Endpoint para el STS no ha podido ser creado.";

        public PGEEndPointCannotBeCreatedException()
            : base(MESSAGE)
        {
        }

        public PGEEndPointCannotBeCreatedException(Exception innerException)
            : base(MESSAGE, innerException)
        {
        }
    }
}
