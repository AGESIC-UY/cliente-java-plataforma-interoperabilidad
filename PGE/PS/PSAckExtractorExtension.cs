using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel.Configuration;
using System.Configuration;
using System.ServiceModel.Description;

namespace AGESIC.PGE.PS
{
    public class PSAckExtractorExtension : BehaviorExtensionElement
    {
        #region Constants

        private const string TopicNameConfig = "TopicName";
        private const string SubscriberNameConfig = "SubscriberName";

        #endregion

        #region Configuration Properties

        [ConfigurationProperty(TopicNameConfig)]
        public string TopicName
        {
            get
            {
                return (string)base[TopicNameConfig];
            }
            set
            {
                base[TopicNameConfig] = value;
            }
        }

        [ConfigurationProperty(SubscriberNameConfig)]
        public string SubscriberName
        {
            get
            {
                return (string)base[SubscriberNameConfig];
            }
            set
            {
                base[SubscriberNameConfig] = value;
            }
        }

        #endregion

        #region BehaviorExtensionElement Members

        public override Type BehaviorType
        {
            get { return typeof(IEndpointBehavior); }
        }

        protected override object CreateBehavior()
        {
            ValidateConfig();

            return CreateInspector();
        }

        #endregion

        #region Utilities

        private object CreateInspector()
        {
            PSAckEndpointBehavior result = null;

            if (!string.IsNullOrEmpty(SubscriberName))
            {
                result = new PSAckEndpointBehavior(new SubscriberInfo(this.TopicName, this.SubscriberName));
            }

            return result;
        }

        protected void ValidateConfig()
        {
            if (string.IsNullOrEmpty(this.TopicName))
                throw new ConfigurationErrorsException("Debe especificar el nombre del tópico en la configuración de la extensión del Behavior");

            if (string.IsNullOrEmpty(this.SubscriberName))
                throw new ConfigurationErrorsException("Debe especificar el nombre del subscriptor en la configuración de la extensión del Behavior");
        }

        #endregion
    }
}
