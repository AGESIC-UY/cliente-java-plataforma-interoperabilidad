using System;
using System.Configuration;

namespace AGESIC.PGE
{
    public class PGEConfigManager
    {
        private static PGEConfigManager instance;

        private PGEConfigManager()
        {
        }

        public static PGEConfigManager GetInstance()
        {
            if (instance == null)
            {
                instance = new PGEConfigManager();
            }
            return instance;
        }

        public PGEConfigSection getPGEConfig()
        {
            PGEConfigSection config =
        (PGEConfigSection)System.Configuration.ConfigurationManager.GetSection(
        "pgeConfigSectionGroup/PGEConfigSection");
            return config;
        }

    }
        

    public class PGEConfigSection : ConfigurationSection
    {
        [ConfigurationProperty("SAMLIssuer")]
        public String SAMLIssuer
        {
            get{
                return (String)this["SAMLIssuer"];
            }
            set {
                this["SAMLIssuer"] = value;
            }
        }

        [ConfigurationProperty("STSUrl")]
        public String STSUrl
        {
            get
            {
                return (String)this["STSUrl"];
            }
            set
            {
                this["STSUrl"] = value;
            }
        }

        [ConfigurationProperty("RSTCertificateDN")]
        public String RSTCertificateDN
        {
            get
            {
                return (String)this["RSTCertificateDN"];
            }
            set
            {
                this["RSTCertificateDN"] = value;
            }
        }

        [ConfigurationProperty("STSUrlSSL")]
        public String STSUrlSSL
        {
            get
            {
                return (String)this["STSUrlSSL"];
            }
            set
            {
                this["STSUrlSSL"] = value;
            }
        }

        [ConfigurationProperty("SAMLMaxFrame",IsRequired=true)]
        public int SAMLMaxFrame
        {
            get
            {
                return (int)this["SAMLMaxFrame"];
            }
            set
            {
                this["SAMLMaxFrame"] = value;
            }
        }

        [ConfigurationProperty("SAMLMinFrame", IsRequired = true)]
        public int SAMLMinFrame
        {
            get
            {
                return (int)this["SAMLMinFrame"];
            }
            set
            {
                this["SAMLMinFrame"] = value;
            }
        }

        [ConfigurationProperty("RSTCertificateStoreName", IsRequired = true)]
        public String RSTCertificateStoreName
        {
            get
            {
                return (String)this["RSTCertificateStoreName"];
            }
            set
            {
                this["RSTCertificateStoreName"] = value;
            }
        }

        [ConfigurationProperty("RSTCertificateStoreLocation", IsRequired = true)]
        public String RSTCertificateStoreLocation
        {
            get
            {
                return (String)this["RSTCertificateStoreLocation"];
            }
            set
            {
                this["RSTCertificateStoreLocation"] = value;
            }
        }

        [ConfigurationProperty("SAMLActor")]
        public String SAMLActor
        {
            get
            {
                return (String)this["SAMLActor"];
            }
            set
            {
                this["SAMLActor"] = value;
            }
        }
    }

    //public class PGEConfigElements : ConfigurationElement
    //{
    //    public PGEConfigElements()
    //        : base()
    //    {

    //    }

    //    [ConfigurationProperty("SAMLIssuer", DefaultValue="Agesic")]
    //    public string SAMLIssuer {
    //        get { return (string)base["SAMLIssuer"]; }

    //        set { base["SAMLIssuer"] = value; }
    //    }
    //}
}
