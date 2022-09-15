using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.PS
{
    public class SubscriberInfo
    {
        public SubscriberInfo(string topicName, string subscriberName)
        {
            if (string.IsNullOrEmpty(topicName))
                throw new ArgumentException("El nombre del tópico no puede ser nulo o vacío");

            if(string.IsNullOrEmpty(subscriberName))
                throw new ArgumentException("El nombre del subscriptor no puede ser nulo o vacío");

            TopicName = topicName;
            Name = subscriberName;
        }

        public string TopicName { get; set; }

        public string Name { get; set; }
    }
}
