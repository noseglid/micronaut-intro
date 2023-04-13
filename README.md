# Java Micronaut Microservice Template

[![Quality Gate Status](https://sonarqube.storytel.dev/api/project_badges/measure?project=com.storytel%3Amicronaut-java-template&metric=alert_status&token=db319b7d86d8ff58fa3ca87986c345da1658d737)](https://sonarqube.storytel.dev/dashboard?id=com.storytel%3Amicronaut-java-template)
[![Coverage](https://sonarqube.storytel.dev/api/project_badges/measure?project=com.storytel%3Amicronaut-java-template&metric=coverage&token=db319b7d86d8ff58fa3ca87986c345da1658d737)](https://sonarqube.storytel.dev/dashboard?id=com.storytel%3Amicronaut-java-template)

## Quickstart
1. Click on "Use this template" button at the top of the page.
1. Find/Replace `micronaut-java-template` with your preferred project name.
1. Logging settings can be found from `src/main/resources/logback.xml`.

## Branching and CI

1. The default CI configuration is tuned to have a single trunk called `main`
1. To create a release, simply use the Releases function on GitHub to set a SemVer tag such as `1.2.3`
1. You can create pre-releases from a branch the same way, choose the branch in the Releases function and add a version suffix `1.2.3-alpha`

## SonarQube Setup
SonarQube pipeline configuration is added CircleCI `config.yml` but you need to enable Pull Request Decoration from SonarQube web.
1. Login with github and [go to projects](https://sonarqube.storytel.dev/projects).
1. Find your newly created service and click on it.
1. Go to you service `Project Settings > General Settings > Pull Request Decoration`.
1. Select already defined configuration (github).
1. Add repository identifier ex: `Storytel/micronaut-java-template` and save it.

## Metrics

This template uses micrometer to expose a prometheus endpoint at `/prometheus`. See [micrometer docs](https://micrometer.io/docs/concepts)
on how to generate metrics with micrometer. Micronaut also exposes some standard metrics, more info can be found in the
[micronaut docs](https://micronaut-projects.github.io/micronaut-micrometer/latest/guide/).

## More info
Micronaut: https://micronaut.io/

Documentation on Micronaut is here: https://docs.micronaut.io/latest/guide/index.html

## Things to consider before building a microservice
Before building your microservice please read this internal document about [Microservice Considerations](https://docs.google.com/document/d/1XP5LePvfBWPqmwfxho_ApDNON2xeJ1Ul2T0zllmHGZw/edit) that the Architect club wrote.
