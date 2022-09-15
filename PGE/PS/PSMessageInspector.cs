using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel.Dispatcher;
using System.ServiceModel.Channels;
using System.Xml;
using System.Diagnostics;

namespace AGESIC.PGE.PS
{
    /// <summary>
    /// Se utiliza para agregar los cabezales necesarios para el uso de Publish and Subscribe
    /// </summary>
    public class PSMessageInspector : IClientMessageInspector
    {
        public PSMessageInspector(SubscriberInfo subscriber)
        {
            Subscriber = subscriber;
        }

        #region Properties

        internal SubscriberInfo Subscriber { get; set; }

        #endregion

        #region IClientMessageInspector members

        public void AfterReceiveReply(ref System.ServiceModel.Channels.Message reply, object correlationState)
        {
            Debug.WriteLine("AfterReceiveReply");

            if (reply.Headers != null && reply.Headers.Count > 0)
            {
                int headerPosition = reply.Headers.FindHeader(Constants.PublishSuscribe.AckValue, Constants.PublishSuscribe.Namespace);

                if (headerPosition != -1)
                {
                    XmlNode[] content = reply.Headers.GetHeader<XmlNode[]>(headerPosition);

                    if (content != null && content.Length > 0)
                    {
                        PSTopicManager.Instance.AddOrUpdateTopic(Subscriber.TopicName, content[0].InnerText);
                    }
                }
            }
        }

        public object BeforeSendRequest(ref System.ServiceModel.Channels.Message request, System.ServiceModel.IClientChannel channel)
        {
            //if (Subscriber != null)
            //{
            //    request.Headers.Add(new TopicHeader(Subscriber.TopicName));
            //    request.Headers.Add(new SubscriberHeader(Subscriber.Name));
            //}

            //if (Producer != null)
            //{
            //    request.Headers.Add(new TopicHeader(Producer.TopicName));
            //    request.Headers.Add(new SubscriberHeader(Producer.Name));
            //}

            return null;
        }

        #endregion
    }
}
