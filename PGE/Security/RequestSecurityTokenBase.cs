using System;
using System.ServiceModel;
using System.ServiceModel.Channels;

namespace AGESIC.PGE.Security
{
    internal abstract class RequestSecurityTokenBase : BodyWriter
    {
        private string m_context;
        private string m_tokenType;
        private int m_keySize;
        private EndpointAddress m_appliesTo;
        
        protected RequestSecurityTokenBase() : this(String.Empty,String.Empty,0, null)
        {
        }

        protected RequestSecurityTokenBase(string context, string tokenType, int keySize, EndpointAddress appliesTo )
            : base(true)
        {
            this.m_context = context;
            this.m_tokenType = tokenType;
            this.m_keySize = keySize;
            this.m_appliesTo = appliesTo;
        }

        public string Context
        {
            get { return m_context; }
            set { m_context = value; }
        }

        public string TokenType 
        { 
            get { return m_tokenType; }
            set { m_tokenType = value; }
        }

        public int KeySize
        {
            get { return m_keySize; }
            set { m_keySize = value; }
        }

        public EndpointAddress AppliesTo
        {
            get { return m_appliesTo; }
            set { m_appliesTo = value; }
        }
    }
}
