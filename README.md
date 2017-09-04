# Take on heroku

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

## Running Locally

Make sure you have Java and Maven installed.  Also, install the [Heroku CLI](https://cli.heroku.com/).

```sh
$ git clone https://github.com/AKholetsky/takeWithHeroku.git
$ cd takeWithHeroku
$ mvn install
$ heroku local:start --port=$(port)
```

Your app should now be running on (http://localhost:$(port)/).

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```
