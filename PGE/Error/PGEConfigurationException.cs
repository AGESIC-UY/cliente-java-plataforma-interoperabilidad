using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.Error
{
    public class PGEConfigurationException : PGEException
    {
        private const string DEFAULT_MESSAGE = "Debe especificar el nombre del ACTOR en el archivo de configuración.";

        public PGEConfigurationException()
            : base(DEFAULT_MESSAGE)
        {
        }

        public PGEConfigurationException(Exception innerException)
            : base(DEFAULT_MESSAGE, innerException)
        {
        }
    }
}
