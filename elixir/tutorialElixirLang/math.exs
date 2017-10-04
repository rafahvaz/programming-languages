defmodule Math do
  def sum(a,b) do
    a + b
  end

  def isZero?(0), do: true
  def isZero?(x) when is_integer(x), do: false

end


IO.puts Math.sum(1,2)
IO.puts Math.isZero? 0
IO.puts Math.isZero? 1
IO.puts Math.isZero? 2
IO.puts Math.isZero? 3
