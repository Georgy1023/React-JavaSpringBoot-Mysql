import React, { Component } from 'react';
import axios from 'axios'


class App extends Component {
  state = {
    title: '',
    content: ''
  }
  handleChange = (e) => {
    this.setState({
      [e.target.id]: e.target.value
    })
  }
  handleSubmit = (e) => {
    e.preventDefault();

    axios.post('http://localhost:8181/addprofessor?name='+this.state.title+'&description='+this.state.content,{name:this.state.title,description:this.state.content})
    .then(response => console.log(response))
    .catch((err)=> {
      console.log(err);
    });
    console.log(this.state.title);
    console.log(this.state.content);
  }
  render() {

    return (
      <div className="container">
        <form className="white" onSubmit={this.handleSubmit}>
          <h5 className="grey-text text-darken-3">Create a New Professor</h5>
          <div className="input-field">
            <input type="text" id='title' onChange={this.handleChange} />
            <label htmlFor="title">Professor Name</label>
          </div>
          <div className="input-field">
            <textarea id="content" className="materialize-textarea" onChange={this.handleChange}></textarea>
            <label htmlFor="content">Professor Description</label>
          </div>
          <div className="input-field">
            <button className="btn pink lighten-1">Add Professor</button>
          </div>
        </form>
      </div>
    )
  }
}

export default App;
