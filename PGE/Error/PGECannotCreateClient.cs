using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.Error
{
    public class PGECannotCreateClientException: PGEException
    {
        private const string MESSAGE = "No se puede crear el objeto cliente.";

        public PGECannotCreateClientException()
            : base(MESSAGE)
        {
        }

        public PGECannotCreateClientException(Exception innerException)
            : base(MESSAGE, innerException)
        {
        }
    }
}
