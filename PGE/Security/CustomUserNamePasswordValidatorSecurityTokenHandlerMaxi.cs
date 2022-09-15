/*
using Microsoft.IdentityModel.SecurityTokenService; 
using Microsoft.IdentityModel.Tokens;

namespace AGESIC.PGE.Security
{ 
    public class CustomUserNamePasswordValidatorSecurityTokenHandler : UserNameSecurityTokenHandler 
    { 
        // Important: You must override CanValidateToken and return true, or your token handler will not be used. 
        public override bool CanValidateToken { get { return true; } }

        public override ClaimsIdentityCollection ValidateToken(SecurityToken token) 
        { 
            if (token == null) 
            { 
                throw new ArgumentNullException(); 
            } 
            UserNameSecurityToken UNtoken = token as UserNameSecurityToken; 
            if (UNtoken == null) 
            { 
                throw new SecurityTokenException("Invalid token"); 
            }

            // Validate UNtoken.UserName and UNtoken.Password here. 

            Claim claim = new Claim(System.IdentityModel.Claims.ClaimTypes.Name, UNtoken.UserName); 
            IClaimsIdentity identity = new ClaimsIdentity(nameClaim,"Password"); 
            identity.Claims.Add( new Claim("http://schemas.microsoft.com/ws/2008/06/identity/claims/ClaimTypes.AuthenticationInstant", XmlConvert.ToString(DateTime.UtcNow, "yyyy-MM-ddTHH:mm:ss.fffZ"), "http://www.w3.org/2001/XMLSchema#dateTime") ); 
            identity.Claims.Add( new Claim("http://schemas.microsoft.com/ws/2008/06/identity/claims/ClaimTypes.AuthenticationMethod", "http://schemas.microsoft.com/ws/2008/06/identity/authenticationmethod/password") );
            return new ClaimsIdentityCollection(new IClaimsIdentity[] { identity }); 
        } 
    } 
}
*/
