using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel.Channels;

namespace AGESIC.PGE.Addressing
{
    internal class WSAActionHeader: MessageHeader
    {
        private string address;

        internal WSAActionHeader(string address)
        {
            this.address = address;
        }

        protected override void OnWriteHeaderContents(System.Xml.XmlDictionaryWriter writer, MessageVersion messageVersion)
        {
            writer.WriteString(this.address);
        }

        public override string Name
        {
            get { return "Action"; }
        }

        public override string Namespace
        {
            get { return Constants.Addressing.NamespaceUri; }
        }
    }
}
