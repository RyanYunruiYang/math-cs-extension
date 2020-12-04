def is_prime(n):
  if n == 2 or n == 3: return True
  if n < 2 or n%2 == 0: return False
  if n < 9: return True
  if n%3 == 0: return False
  r = int(n**0.5)
  # since all primes > 3 are of the form 6n ± 1
  # start with f=5 (which is prime)
  # and test f, f+2 for being prime
  # then loop by 6. 
  f = 5
  while f <= r:
 #   print('\t',f)
    if n % f == 0: return False
    if n % (f+2) == 0: return False
    f += 6
  return True    


# rem = []
# for x in range(1,102):
# 	if is_prime(x):
# 	    c = 1
# 	    for i in range(x):
# 	    	c *= (i**4-i*i+1) % x
# 	    print(str(x)+": " + str(c%x))
# 	    #rem.append((x,c%x))
p = 101
counter = [0 for x in range(p)]
print(counter)
for i in range(p):
	print((i**4-i*i+1) % p)
	counter[(i**4-i*i+1) % p]+=1
#rem.append((x,c%x))	    
for i in range(p):
	print(str(i)+": " + str(counter[i]))