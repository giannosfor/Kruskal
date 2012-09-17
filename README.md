The Problem

Suppose we have a set of locations V = {vl, v2 ..... vn}, and we want to build a
communication network on top of them. The network should be connected--
there should be a path between every pair of nodes--but subiect to this’
requirement, we wish to build it as cheaply as possible.
For certain pairs (vi, vj), we may build a direct link between vi and vj for
a certain cost c(vi, vj) > 0. Thus we can represent the set of possible links that
may be built using a graph G = (V, E), with a positive cost Ce associated with
each edge e = (vi, vj). The problem is to find a subset of the edges T_ E so
that the graph (V, T) is connected, and the total cost ~e~T Ce is as small as
possible. (We will assume that thefull graph G is connected; otherwise, no
solution is possible.)

Algorithm Design by Jon Kleinberg and Éva Tardos