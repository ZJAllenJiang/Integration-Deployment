# Integration-Deployment

## Kubernetes
### Kubernetes Dashboard
1. Dashboard login: kubectl -n kubernetes-dashboard get secret $(kubectl -n kubernetes-dashboard get sa/admin-user -o jsonpath="{.secrets[0].name}") -o go-template="{{.data.token | base64decode}}"

### Kubernetes Yaml
1. Yaml generator: https://octopus.com/
2. Octopus deployment: https://hub.docker.com/r/octopusdeploy/octopusdeploy

## Nginx
### Nginx configuration
1. Configuration file location 
Add configs in -> /usr/local/etc/nginx/servers/
Default config -> /usr/local/etc/nginx/nginx.conf
Logs will be in -> /usr/local/var/log/nginx/
Default webroot is -> /usr/local/var/www/
Default listen address -> http://localhost:8080
