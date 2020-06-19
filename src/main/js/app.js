import React, {Component} from 'react';
import ReactDOM from 'react-dom';

class App extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        return <div>REACT RENDER</div>;
    }

}

ReactDOM.render(
    <App/>,
    document.getElementById('root')
);