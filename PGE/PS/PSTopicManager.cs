using System;
using System.Collections.Generic;

namespace AGESIC.PGE.PS
{
    /// <summary>
    /// Clase singleton que se utiliza para obtener el último tópico obtenido por el subscriptor
    /// </summary>
    public class PSTopicManager
    {
        private static PSTopicManager _Instance;

        private IDictionary<string, string> _LastSubscriberTopic;

        static PSTopicManager()
        {
            _Instance = new PSTopicManager();
        }

        protected PSTopicManager()
        {
            _LastSubscriberTopic = new Dictionary<string, string>();
        }

        public static PSTopicManager Instance
        {
            get { return _Instance; }
        }

        private IDictionary<string, string> SubscriberTopics
        {
            get { return _LastSubscriberTopic; }
        }

        internal void AddOrUpdateTopic(string topicName, string lastId)
        {
            if (!string.IsNullOrEmpty(topicName))
            {
                if (!SubscriberTopics.ContainsKey(topicName))
                    SubscriberTopics.Add(new KeyValuePair<string, string>(topicName, lastId));
                else
                    SubscriberTopics[topicName] = lastId;
            }
        }

        public string GetLastIDByTopic(string topicName)
        {
            string result = null;

            if (!string.IsNullOrEmpty(topicName) && SubscriberTopics.ContainsKey(topicName))
                SubscriberTopics.TryGetValue(topicName, out result);

            return result;
        }

        public void ClearTopic(string topicName)
        {
            if(!string.IsNullOrEmpty(topicName))
                SubscriberTopics.Remove(topicName);
        }

        public void ClearAllTopics()
        {
            SubscriberTopics.Clear();
        }
    }
}
