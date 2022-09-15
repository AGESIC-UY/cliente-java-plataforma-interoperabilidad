using System;

namespace AGESIC.PGE.Error
{
    public class PGEUserNameSecurityTokenInvalidException : PGEException
    {
        public PGEUserNameSecurityTokenInvalidException()
            : base()
        {

        }

        public PGEUserNameSecurityTokenInvalidException(string message)
            : base(message)
        {

        }
    }
}
