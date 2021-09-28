/**
* PROXY Design Patter Example {Structural Design Patter}
* PROXY meaning "Filter", usually we call PROXY in the networking language, which control network level to filter based on the network rule.
* Similarly creating simple example to Proxy Class which implement the same interface and write the condition for user before proceeding to actual executer.
* PROXY
* {Remote Proxy 		- Accession Remote Server- Accessing outside world}
* {Virtual Proxy 		- Control Access to a Resource that is Expensive to create (Cache) (Lazy Evaluation)} 
* {Protection Proxy 	- Access Management}
* 
* Single line: It add's additional behaviour like decorator Patter, it controling access to the underlying object(because it won't change the behaviour of interface) 
*/

/**
* @author Kumar.Sagayam
*
*/


package com.kumar.sagayam.desginpattern.proxy;