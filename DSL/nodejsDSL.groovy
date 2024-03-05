job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/Betty-Arias/nodejsapp.git', 'master') { node ->
            node / gitConfigName('Betty-Arias')
            node / gitConfigEmail('bttyloha@gmail.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
    publishers {
         mailer('bettyarias3030@gmail.com', true, true)
    }
}
