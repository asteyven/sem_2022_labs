# SEM_Demo

Master Build  ![workflow](https://github.com/Kevin-Sim/sem_2022_labs/actions/workflows/main.yml/badge.svg)

License ![GitHub](https://img.shields.io/github/license/Kevin-Sim/sem_2022_labs)

Release ![Releases](https://img.shields.io/github/release/Kevin-Sim/sem_2022_labs?style=flat-square)

## changed to world db

Add Integration Test to GitHub Actions and Code

- starts db using Dockerfile exposing port 33060
- Runs maven tests locally (in GitHub Actions)
- Tidies up

`---------------------------------`

To tag 

`git tag V0.1-alpha-3`

To push tags

`git push origin tag_name`



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

Copy from container works if running or not

`docker container cp sem_2022_labs_app_1:./tmp/tmp ./`