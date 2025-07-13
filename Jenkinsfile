pipeline {
    agent any  // Ejecuta en cualquier nodo disponible de Jenkins

    // Programación automática diaria a las 03:00 AM
    triggers {
        cron('0 3 * * *')
    }

    stages {
        stage('Checkout') {
            steps {
                // Clona el repositorio desde GitHub
                git branch: 'develop', url: 'https://github.com/juancafernandez18/Selenium24.git'
            }
        }

        stage('Run Tests') {
            steps {
                // Ejecuta los tests con el tag especificado y sin headless
                sh "./gradlew cucumberTest -Dcucumber.filter.tags='@agregarcarritos' -Dheadless=false"
            }
        }

        stage('Publish Allure Report') {
            steps {
                // Publica los reportes de Allure desde la carpeta indicada
                allure([
                    results: [[path: 'build/allure-results']]
                ])
            }
        }
    }

    post {
        always {
            // Publica los resultados JUnit para visualizar en Jenkins
            junit 'build/test-results/test/*.xml'
        }
    }
}
