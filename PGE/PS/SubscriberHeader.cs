using System;
using System.ServiceModel.Channels;


namespace AGESIC.PGE.PS
{
    public class SubscriberHeader : MessageHeader
    {
        internal string NombreSuscriptor { get; private set; }
        
        
        internal SubscriberHeader(string nombreSuscriptor)
        {
            if (string.IsNullOrEmpty(nombreSuscriptor))
                throw new ArgumentException("El nombre del suscriptor de la novedad no puede ser nulo o vacío");

            NombreSuscriptor = nombreSuscriptor;
        }

        public override string Namespace
        {
            get { return Constants.PublishSuscribe.Namespace; }
        }

        public override string Name
        {
            get { return Constants.PublishSuscribe.SubscriberValue; }
        }

        protected override void OnWriteHeaderContents(System.Xml.XmlDictionaryWriter writer, MessageVersion messageVersion)
        {
            writer.WriteString(this.NombreSuscriptor);
        }
    }
}
