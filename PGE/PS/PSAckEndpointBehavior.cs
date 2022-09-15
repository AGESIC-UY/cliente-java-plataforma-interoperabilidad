using System;
using System.ServiceModel.Description;

namespace AGESIC.PGE.PS
{
    public class PSAckEndpointBehavior : IEndpointBehavior
    {
        private SubscriberInfo _Subscriber;

        public PSAckEndpointBehavior(SubscriberInfo subscriber)
        {
            if (subscriber == null)
                throw new ArgumentNullException("subscriber");

            _Subscriber = subscriber;
        }

        internal SubscriberInfo Subscriber
        {
            get { return _Subscriber; }
        }

        public void AddBindingParameters(ServiceEndpoint endpoint, System.ServiceModel.Channels.BindingParameterCollection bindingParameters)
        {
        }

        public void ApplyClientBehavior(ServiceEndpoint endpoint, System.ServiceModel.Dispatcher.ClientRuntime clientRuntime)
        {
            clientRuntime.MessageInspectors.Add(new PSMessageInspector(Subscriber));
        }

        public void ApplyDispatchBehavior(ServiceEndpoint endpoint, System.ServiceModel.Dispatcher.EndpointDispatcher endpointDispatcher)
        {
        }

        public void Validate(ServiceEndpoint endpoint)
        {
        }
    }
}
