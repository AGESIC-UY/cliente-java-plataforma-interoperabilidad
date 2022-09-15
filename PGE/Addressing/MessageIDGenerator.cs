using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Xml;

namespace AGESIC.PGE.Addressing
{
    internal class MessageIDGenerator
    {
        private static Random random = new Random();

        internal static string Generate()
        {
            UniqueId messageId = new UniqueId();
            return messageId.ToString();
        }
    }
}
