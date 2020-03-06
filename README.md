# GraphQL

use     http://localhost:8080/h2-console/ 
and
        http://localhost:8080/graphiql?

1. Create Author

                mutation {
                  createAuthor(name: "Vitalii",age: 26) {
                      id name
                  }
                }


2. Create Tutorial

              mutation {
                createTutorial (
                    title: "Tutorial #1",
                    description: "Description for GTM Tutorial#1"
                    author: 1
                  ){
                    id title author { name }
                  }
              }
3. Read all Authors

            {
              findAllAuthors{
                id
                name
                age
              }
            }

4. Read all Tutorials

            {
              findAllTutorials{
                id
                title
                description
                author{
                  id
                  name
                }
              }
             }
5. Update a Tutorial

            mutation {
              updateTutorial (
                id: 2
                description: "updated Desc Tut#2")
                {
                  id title description author { name }
                }
            }

6. Delete a Tutorial

          mutation {
            deleteTutorial(id: 1)
          }
          
7. Count number of Tutorials   

        {
          countTutorials
        }
