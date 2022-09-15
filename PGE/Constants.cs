
namespace AGESIC.PGE
{
    internal class Constants
    {
        public const string UserNameTypeUri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#UsernameToken";
        public const string SamlTokenTypeUri = "http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV1.1";

        public class Trust
        {
            public const string NamespaceUri = "http://schemas.xmlsoap.org/ws/2005/02/trust";

            public class Actions
            {
                public const string Issue = "http://schemas.xmlsoap.org/ws/2005/02/trust/Issue";
                public const string IssueReply = "http://schemas.xmlsoap.org/ws/2005/02/trust/Issue";
            }

            public class Attributes
            {
                public const string Context = "Context";
            }

            public class Elements
            {
                public const string KeySize = "KeySize";
                public const string Entropy = "Entropy";
                public const string BinarySecret = "BinarySecret";
                public const string RequestSecurityToken = "RequestSecurityToken";
                public const string RequestSecurityTokenResponse = "RequestSecurityTokenResponse";
                public const string TokenType = "TokenType";
                public const string RequestedSecurityToken = "RequestedSecurityToken";
                public const string RequestedAttachedReference = "RequestedAttachedReference";
                public const string RequestedUnattachedReference = "RequestedUnattachedReference";
                public const string RequestedProofToken = "RequestedProofToken";
                public const string ComputedKey = "ComputedKey";
                public const string RequestType = "RequestType";
                public const string Issuer = "Issuer";
                public const string Base = "Base";
                public const string SecondaryParameters = "SecondaryParameters";
            }

            public class ComputedKeyAlgorithms
            {
                public const string PSHA1 = "http://schemas.xmlsoap.org/ws/2005/02/trust/CK/PSHA1";
            }
        }

        public class Policy
        {
            public const string NamespaceUri = "http://schemas.xmlsoap.org/ws/2004/09/policy";

            public class Elements
            {
                public const string AppliesTo = "AppliesTo";
            }
        }

        public class Addressing
        {
            public const string NamespaceUri = "http://www.w3.org/2005/08/addressing";
            public const string NmaespaceUriOasis = "http://schemas.xmlsoap.org/ws/2004/08/addressing";

            public class Elements
            {
                public const string EndpointReference = "EndpointReference";
                public const string Address = "Address";
            }
        }
        public class SAML
        {
            public class AuthenticationMethods
            {
                public const string Password = "urn:oasis:names:tc:SAML:1.0:am:password";
            }

            public class SubjectFormats
            {
                public const string EMail = "urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress";
            }

            public class ConfirmationMethods
            {
                public const string Bearer = "urn:oasis:names:tc:SAML:1.0:cm:bearer";
            }
        }

        public class PublishSuscribe
        {
            public const string Namespace = "http://ps.agesic.gub.uy";
            public const string TopicValue = "topic";
            public const string ProducerValue = "producer";
            public const string SubscriberValue = "subscriber";
            public const string AckValue = "notificationId";
        }

    }
}
