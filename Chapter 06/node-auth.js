import express from 'express';
import base64 from 'base-64';

const app = express();

app.get('/protected', (req, res) => {
  const authHeader = req.headers.authorization;
  if (!authHeader?.startsWith('Basic ')) {
    res.set('WWW-Authenticate', 'Basic realm="Secure"');
    return res.status(401).send('Unauthorized');
  }
  const base64Credentials = authHeader.split(' ')[1];
  const credentials = base64.decode(base64Credentials);
  const [username, password] = credentials.split(':');

  // Validate against a database or LDAP (pseudo-code)
  if (username !== 'alice' || password !== 'password123') 
  {
    return res.status(403).send('Forbidden');
  }
  res.send('Access granted!');
});
