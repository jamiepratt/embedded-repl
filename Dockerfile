FROM clojure:tools-deps

COPY . /usr/src/embedded-repl
WORKDIR /usr/src/embedded-repl

RUN clj -T:build uber

CMD [ "java", "-jar", "target/app-standalone.jar" ]

