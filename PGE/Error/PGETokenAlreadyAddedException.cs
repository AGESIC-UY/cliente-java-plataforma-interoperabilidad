using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.Error
{
    public class PGETokenAlreadyAddedException : PGEException
    {
        private const string MESSAGE = "El Token ya ha sido agregado al cabezal en este contexto.";

        public PGETokenAlreadyAddedException()
            : base(MESSAGE)
        {
        }

        public PGETokenAlreadyAddedException(Exception innerException)
            : base(MESSAGE, innerException)
        {
        }
    }
}
