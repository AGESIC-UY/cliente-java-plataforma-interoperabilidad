using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.Error
{
    public class PGETokenCannotBeAdded : PGEException
    {
        private const string MESSAGE = "No se pudo agregar el Token de seguridad al cabezal SOAP.";
        
        public PGETokenCannotBeAdded()
            : base(MESSAGE)
        {
        }

        public PGETokenCannotBeAdded(Exception innerException)
            : base(MESSAGE, innerException)
        {
        }
    }
}
