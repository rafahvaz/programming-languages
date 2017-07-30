require 'pp'

require_relative 'user'

user = User.new 'john@example.com', 'John'

pp user
user.save