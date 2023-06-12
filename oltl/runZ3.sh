#!/bin/bash
# !/Applications/z3/bin/
ls > oltl.output.txt
/Applications/z3/bin/z3 z3.input.smt2 pp.decimal=true pp.single_line=true -st > z3.output.txt
# open oltl.output.txt