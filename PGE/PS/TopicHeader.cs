using System;
using System.ServiceModel.Channels;


namespace AGESIC.PGE.PS
{
    public class TopicHeader : MessageHeader
    {
        internal string NombreTopico { get; private set; }
        
        
        internal TopicHeader(string nombreTopico)
        {
            if (string.IsNullOrEmpty(nombreTopico))
                throw new ArgumentException("El nombre del topico de la novedad no puede ser nulo o vacío");

            NombreTopico = nombreTopico;
        }

        public override string Namespace
        {
            get { return Constants.PublishSuscribe.Namespace; }
        }

        public override string Name
        {
            get { return Constants.PublishSuscribe.TopicValue; }
        }

        protected override void OnWriteHeaderContents(System.Xml.XmlDictionaryWriter writer, MessageVersion messageVersion)
        {
            writer.WriteString(this.NombreTopico);
        }
    }
}
