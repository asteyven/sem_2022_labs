# SEM_Demo

![workflow](https://github.com/Kevin-Sim/lab02/actions/workflows/main.yml/badge.svg)

```
git rm --cached seMethods.iml
git checkout -m "remove iml"
git push
```

connect to a running docker container

`docker exec -it [container ID] bash`

connect to sql daemon (prompted for password on connect)

`mysql --user root --password [database name]`

connect to a docker Image

`docker run -it --entrypoint /bin/bash [Image ID]`

Stop all running docker containers from windows powershell

`docker stop $(docker ps -a -q)`

Remove all containers

`docker rm $(docker ps -a -q)`

Remove submodule from commit
`git rm --cached db/test_db`

Create a container from an image make changes and commit to new image

`docker run -it ubuntu`

make changes

commit to image

`docker commit <container ID> <Image name>`

Then restarting new image maintains changes