using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.Error
{
    public class PGEException: Exception
    {
        private const string DEFAULT_MESSAGE = "Ha ocurrido un error al tratar de consumir el servicio de la PGE.";

        public PGEException()
            : base(DEFAULT_MESSAGE)
        {
        }

        public PGEException(Exception innerException)
            : base(DEFAULT_MESSAGE, innerException)
        {
        }

        public PGEException(string message)
            : base(message)
        {
        }

        public PGEException(string message, Exception innerException)
            : base(message, innerException)
        {
        }
    }
}
