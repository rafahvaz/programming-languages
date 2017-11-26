defmodule Math do
  def sum(a,b) do
    a + b
  end

  def isZero?(0), do: true
  def isZero?(x) when is_integer(x), do: false
end

defmodule Hello do
  def helloWorldName(name \\ "John") do
    "Hello, " <> name
  end
end

defmodule Guards do
  def test(a \\ 1, b \\ 2)

  def test(a, b) when is_nil(b) do
    a
  end

  def test(a, b) when is_integer(b) do
    a + b
  end

  def test(a, b) do
    a <> b
  end
end

defmodule RecFunc do
  def print_numbers_until_zero(number) when number <= 0 do
    IO.puts "N = 0"
  end

  def print_numbers_until_zero(number) do
    IO.puts ("N = " <> to_string number)
    print_numbers_until_zero(number - 1)
  end
end

RecFunc.print_numbers_until_zero(10)

IO.puts Enum.reduce([1,2,3], 0, fn(x, acc) -> x + acc end)
IO.puts Enum.map([1,2,3,4], fn(x) -> x * 2 end)

defmodule ListStuff do
  def print_key_value(list) when (list) do
  end
end
