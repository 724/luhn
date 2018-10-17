[ ![Download](https://api.bintray.com/packages/farhad/maven/luhn/images/download.svg) ](https://bintray.com/farhad/maven/luhn/_latestVersion)

```
	repositories {
		jcenter()
	}
	
	implementation 'io.github.the724:luhn:[latest-version]'
	
```

In the Java/Android code :

```
	if(LuhnChecksum.evaluate("your-expression")){
		/**
		* the expression checksum is correct ( e.g a creditcard number )
		*/
	}
```

### Luhn Algorithm

The Luhn algorithm or Luhn formula, also known as the "modulus 10" or "mod 10" algorithm, is a simple checksum formula used to validate a variety of identification numbers, such as credit card numbers, IMEI numbers, National Provider Identifier numbers in the United States, Canadian Social Insurance Numbers, Israel ID Numbers and Greek Social Security Numbers (ΑΜΚΑ). It was created by IBM scientist Hans Peter Luhn and described in U.S. Patent No. 2,950,048, filed on January 6, 1954, and granted on August 23, 1960.

The algorithm is in the public domain and is in wide use today. It is specified in ISO/IEC 7812-1.[1] It is not intended to be a cryptographically secure hash function; it was designed to protect against accidental errors, not malicious attacks. Most credit cards and many government identification numbers use the algorithm as a simple method of distinguishing valid numbers from mistyped or otherwise incorrect numbers.

### License

    Copyright (C) 2018  Farhad Faghihi

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.