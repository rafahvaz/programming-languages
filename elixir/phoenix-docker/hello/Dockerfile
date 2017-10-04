FROM elixir

RUN mkdir -p /hello
WORKDIR /hello

# PHOENIX FRAMEWORK CONFIGURATIONS
COPY . /hello
RUN mix local.hex --force && mix local.rebar --force
RUN mix archive.install https://github.com/phoenixframework/archives/raw/master/phx_new.ez

COPY mix.exs /hello
RUN mix deps.get
RUN mix deps.compile
RUN curl -sL https://deb.nodesource.com/setup_6.x | bash -
RUN apt-get install -y -q nodejs
RUN cd assets && npm install

# POSTGRESQL DATABASE CONFIGURATIONS
# CMD ["postgres","psql"]
# RUN ["\password", "postgres"]
# RUN ["\q"]
# RUN ["service","postgresql","restart"]
