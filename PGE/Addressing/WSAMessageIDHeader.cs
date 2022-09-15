using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel.Channels;

namespace AGESIC.PGE.Addressing
{
    internal class WSAMessageIDHeader : MessageHeader
    {
        private string messageId;

        internal WSAMessageIDHeader(string messageId)
        {
            this.messageId = messageId;
        }

        protected override void OnWriteHeaderContents(System.Xml.XmlDictionaryWriter writer, MessageVersion messageVersion)
        {
            writer.WriteString(this.messageId);
        }

        public override string Name
        {
            get { return "MessageID"; }
        }

        public override string Namespace
        {
            get { return Constants.Addressing.NamespaceUri; }
        }
    }
}
