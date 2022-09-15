using System;
using System.IdentityModel.Tokens;
using System.ServiceModel.Channels;
using System.ServiceModel.Security;
using AGESIC.PGE.Error;

namespace AGESIC.PGE.Security
{
    internal class SamlTokenHeaderEmbedder : MessageHeader
    {
        private SecurityToken tkn;

        public SamlTokenHeaderEmbedder(SecurityToken tkn)
        {
            this.tkn = tkn;
        }

        protected override void OnWriteHeaderContents(System.Xml.XmlDictionaryWriter writer, MessageVersion messageVersion)
        {
            if (tkn != null)
            {
                WSSecurityTokenSerializer ser = new WSSecurityTokenSerializer();
                ser.WriteToken(writer, tkn);
            }
            else
                throw new PGETokenCannotBeAddedException();
        }

        public override string Name
        {
            get { return "Security";}
        }

        public override string Namespace
        {
            get { return "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"; }
        }
        
        public override bool MustUnderstand
        {
            get
            {
                return true;
            }
        }

        public override string  Actor
        {
            get
            {
                return Configuration.SecurityToken.SAMLActor;
            }
        }
    }
}
