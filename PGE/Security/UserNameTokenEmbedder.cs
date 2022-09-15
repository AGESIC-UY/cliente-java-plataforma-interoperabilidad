using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel.Channels;
using System.IdentityModel.Tokens;
using System.ServiceModel.Security;
using AGESIC.PGE.Error;

namespace AGESIC.PGE.Security
{
    /// <summary>
    /// Clase utilizada para embeber el UserNameSecurityToken de WS-Security dentro del Cabezal de los Mensajes.
    /// </summary>
    internal class UserNameTokenEmbedder : MessageHeader
    {
        public UserNameTokenEmbedder(string userName, string password)
        {
            UserName = userName;
            Password = password;
        }

        public string UserName { internal set;  get; }

        public string Password { internal set; get; }

        protected override void OnWriteHeaderContents(System.Xml.XmlDictionaryWriter writer, MessageVersion messageVersion)
        {
            try
            {
                UserNameSecurityToken tkn = new UserNameSecurityToken(UserName, Password);
                
                WSSecurityTokenSerializer ser = new WSSecurityTokenSerializer();
                ser.WriteToken(writer, tkn);
            }
            catch (Exception ex)
            {
                throw new PGEUserNameSecurityTokenCannotBeAdded(ex);
            }
        }

        public override string Name
        {
            get { return "Security"; }
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
    }
}
