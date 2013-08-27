#!/bin/bash -ex
git pull --rebase &&\
git push origin && \
git push heroku

