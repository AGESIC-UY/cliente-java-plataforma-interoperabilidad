using System;
using System.ServiceModel.Channels;


namespace AGESIC.PGE.PS
{
    public class ProducerHeader : MessageHeader
    {
        internal string NombreProductor { get; private set; }
        
        
        internal ProducerHeader(string nombreProductor)
        {
            if (string.IsNullOrEmpty(nombreProductor))
                throw new ArgumentException("El nombre del productor de la novedad no puede ser nulo o vacío");

            NombreProductor = nombreProductor;
        }

        public override string Namespace
        {
            get { return Constants.PublishSuscribe.Namespace; }
        }

        public override string Name
        {
            get { return Constants.PublishSuscribe.ProducerValue; }
        }

        protected override void OnWriteHeaderContents(System.Xml.XmlDictionaryWriter writer, MessageVersion messageVersion)
        {
            writer.WriteString(this.NombreProductor);
        }
    }
}
