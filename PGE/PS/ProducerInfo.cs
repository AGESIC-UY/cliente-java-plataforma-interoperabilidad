using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AGESIC.PGE.PS
{
    public class ProducerInfo
    {
        public ProducerInfo(string topicName, string producerName)
        {
            if (string.IsNullOrEmpty(topicName))
                throw new ArgumentException("El nombre del tópico no puede ser nulo o vacío");

            if (string.IsNullOrEmpty(producerName))
                throw new ArgumentException("El nombre del productor no puede ser nulo o vacío");

            TopicName = topicName;
            Name = producerName;
        }

        public string TopicName { get; set; }

        public string Name { get; set; }
    }
}
