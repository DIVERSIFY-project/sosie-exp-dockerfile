FROM simonallier/sosie-exp-base
MAINTAINER simon.allier@gmail.com


WORKDIR /home/user
RUN git clone https://github.com/DIVERSIFY-project/sosies-generator.git
WORKDIR /home/user/sosies-generator
RUN git checkout rewrite_ast

RUN mvn package -Dmaven.test.skip=true
